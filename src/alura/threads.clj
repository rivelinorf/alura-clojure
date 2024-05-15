(ns alura.threads)

(def stock {"Mochila" 10, "Camiseta" 5, "Tenis" 2})
(println stock)
(println (count stock))
(println (keys stock))
(println (vals stock))

(def stock {:Mochila 10, :Camiseta 5, :Tenis 2, :Meia 4})

(println (assoc stock :Calca 4))
(println (assoc stock :Mochila 1))
(println (update stock :Mochila inc))
(println (update stock :Mochila (fn [value] (- value 1))))
(println (update stock :Mochila #(- % 3)))

(println (dissoc stock :Mochila))

; -----------------------------------------------------------------------------------
(def order {
            :Mochila {:quantidade 1, :price 80}
            :Camiseta {:quantidade 2, :price 40}
            })
(println order)

(println (assoc order :Chaveiro {:quantidade 1, :price 4}))
(def order (assoc order :Chaveiro {:quantidade 1, :price 4}))

(println order)

(println (order :Chaveiro))
(println (get order :Chaveiro))
(println (get order :Mochila))
(println (get order :Cadeira {:quantidade 0}))
(println (:Mochila order) )
(println (:quantidade (:Mochila order))  )                  ;PREFIX
(println (:quantidade (:Camiseta order))  )

(println (update-in stock [:Chaveiro :quantidade] inc))

; Threading FIRST
(println (:quantidade (:Chaveiro stock)))
(println (-> stock :Chaveiro :quantidade))
(println (-> stock :Chaveiro :price))
(-> stock :Mochila :price println)
(-> stock :Mochila println)

