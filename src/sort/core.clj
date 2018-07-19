(ns sort.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
;; Bubble Sort

(defn- bubble [ys x]
  (if-let [y (peek ys)]
    (if (> y x)
      (conj (pop ys) x y)
       (conj ys x)
      )
    [x]
    )
  )







;; Insertion sort
(defn insert[l k]


  )
