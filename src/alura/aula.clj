(ns alura.aula)


(defn discount [valor]
  (* valor (- 1 0.1)))

(defn discount [valor]
  (def value 0.1)
  (* valor (- 1 value)))

(defn discount [valor]
  (let [value 0.1] )
  (* valor (- 1 value)))

(defn discount [valor]
  (let [value 0.1]
    (* valor (- 1 value)))
  )

(defn discount [valor]
  (let [value 0.1]
    (println "Calculando desconto de " value "%")
    (* valor (- 1 value)))
  )

(defn discount [valor]
  (let [value 0.1]
    (println "Calculando desconto de " (* value 100) "%")
    (* valor (- 1 value))))

(defn discount [valor]
  (let [value 0.1
        tax (* valor value)]
    (println "Calculando desconto de " (* value 100) "%")
    (- valor tax)))

(if (> 600 100)
  (println "TRUE")
  (println "FALSE"))

(if (< 600 100)
  (println "TRUE")
  (println "FALSE"))

(defn discount [valor]
  (if (> valor 100)
    (let [value 0.1
          tax (* valor value)]
      (println "Calculando desconto de " (* value 100) "%")
      (- valor tax))
    ))

(defn discount [valor]
  (if (> valor 100)
    (let [value 0.1
          tax (* valor value)]
      (println "Calculando desconto de " (* value 100) "%")
      (- valor tax))
    valor
    ))
(discount 900)