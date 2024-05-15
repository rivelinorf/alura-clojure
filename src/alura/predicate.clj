(ns alura.predicate)

; Predicate - put ? name of function
(defn give-discount?
  [valor]
  (if (> valor 100)
    true
    false))
(println "Using if")
(println (give-discount? 100))
(println (give-discount? 1000))

(defn give-discount?
  [valor]
  (if (> valor 100)
    true))
(println "Using if without else")
(println (give-discount? 100))
(println (give-discount? 1000))

(defn give-discount?
  [valor]
  (when (> valor 100)
    true))
(println "Using when")
(println (give-discount? 100))
(println (give-discount? 1000))

(defn give-discount?
  [valor]
  (> valor 100))
(println "Using direct")
(println (give-discount? 100))
(println (give-discount? 1000))

(defn discount [valor]
  (if (give-discount? valor)
    (let [value 0.1
          tax (* valor value)]
      (- valor tax))
    valor
    ))

(println (discount 100))
(println (discount 1000))

(defn discount [give? valor]
  (if (give? valor)
    (let [value 0.1
          tax (* valor value)]
      (- valor tax))
    valor
    ))

(println (discount give-discount? 100))
(println (discount give-discount? 800))

(fn [valor] (> valor 100))
(println (discount (fn [valor] (> valor 100)) 100))
(println (discount (fn [valor] (> valor 100)) 500))

(println (discount #(> %1 100) 100))
(println (discount #(> %1 100) 600))

(println (discount #(> % 100) 100))
(println (discount #(> % 100) 200))