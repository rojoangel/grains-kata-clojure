(ns grains.core)

(defn- exp [x n]
  (reduce * (repeat n x)))

(defn square->grains [square]
  (exp 2 (- square 1)))
