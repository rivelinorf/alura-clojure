(ns alura.maps)

(def order {
            :Mochila {:quantidade 1, :price 80}
            :Camiseta {:quantidade 2, :price 40}
            })
(println order)

(defn print-15 [value] (println "value" value) 15)
(print-15 45)
(println (map print-15 order))

(defn print-15 [[key value]] (println key "->" value) 15)
(println (map print-15 order))

(defn print-15 [[key value]] value)
(println (map print-15 order))

(defn price-product [[key value]]
  (* (:quantidade value) (:price value)))
(println (map price-product order))
(println (reduce + (map price-product order)) )

(defn price-product [[_ value]]
  (* (:quantidade value) (:price value)))

(println (map price-product order))
(println (reduce + (map price-product order)) )

(defn total-order [order ]
  (reduce + (map price-product order)))
(println (total-order order))

(defn total-order [order]
  (->> order
      (map price-product)
      (reduce +)))
(println (total-order order))



(defn price-product [product]
  (* (:quantidade product) (:price product)))
(defn total-order [order]
  (->> order
       vals
       (map price-product)
       (reduce +)))
(println (total-order order))

; ----------------------------------------------------------------

(def order {
            :Mochila {:quantidade 1, :price 80}
            :Camiseta {:quantidade 2, :price 40}
            :Chaveiro {:quantidade 1, :price 0}
            })
(println order)

(defn free? [item] (<= (get item :price 0) 0) )
(println (filter free? (vals order)))

(defn free? [[key value]] (<= (get value :price 0) 0) )
(println (filter free? order))
(println (keys (filter free? order)))

(defn free? [item] (<= (get item :price 0) 0) )
(println (filter (fn [[key value]] (free? value)) order))
(println (filter #(free? (second %)) order))

(defn pay? [item] (not (free? item)))
(println (filter #(pay? (second %)) order))

(def clientes [
               { :nome "Guilherme"
                :certificados ["Clojure" "Java" "Machine Learning"] }
               { :nome "Paulo"
                :certificados ["Java" "Ciência da Computação"] }
               { :nome "Daniela"
                :certificados ["Arquitetura" "Gastronomia"] }])
(println (map :certificados clientes))
(println (map count (map :certificados clientes)) )

(println (->> clientes
              (map :certificados)
              (map count)
              (reduce +)))
