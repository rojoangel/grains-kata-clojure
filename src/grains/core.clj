(ns grains.core)

(defn square->grains [square]
  (if (= square 1)
    1
    (if (= square 2)
      2)))
