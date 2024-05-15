(ns alura.vector)

(def prices [30 700 100])
(println (prices 0))
(println (get prices 2))
(println (get prices 7))
(println (prices 9))
(println (get prices 8 0))
(println (get prices 8 "null"))

(println (conj prices 400))
(println prices)

(println (+ 5 1))
(println (inc 90))
(println (update prices 0 inc))
(println (update prices 0 dec))

(defn increase [value] (+ value 1))
(println (update prices 2 increase))


(println (update prices 1 (fn [value] (+ value 1)) ))


(defn give-discount?
  [valor]
  (> valor 100))

(defn discount [valor]
  (if (give-discount? valor)
    (let [value 0.1
          tax (* valor value)]
      (- valor tax))
    valor
    ))

(println prices)

(println (map discount prices))
(println (range 10))
(println (filter even? (range 10)))

(println (filter give-discount? prices))

(println (map discount (filter give-discount? prices)))

(println (reduce + prices))

(defn sum [v1 v2] (+ v1 v2))
(println (reduce sum prices))
(println (reduce sum (range 10 20)))
(println (reduce sum (range 1000)))
(println (reduce sum [1 2 3 4 5]))
(println (reduce sum 100 [1 2 3 4 5]))