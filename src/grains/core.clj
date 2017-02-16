(ns grains.core)

(defn exp [x n]
  "x^n, uses *' to avoid ArithmeticException"
  (reduce *' (repeat n x)))

(defn square->grains [square]
  (exp 2 (- square 1)))

(defn chessboard->grains []
  (apply + (map square->grains (range 1 (inc 64)))))

