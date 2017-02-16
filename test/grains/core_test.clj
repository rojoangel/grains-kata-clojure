(ns grains.core-test
  (:require [clojure.test :refer :all]
            [grains.core :refer :all]))

(defn- geometric-progression->sum [a r n]
  "geometric progression sum formulae from https://en.wikipedia.org/wiki/Geometric_progression#Derivation"
  (* a (/ (- 1 (exp r n)) (- 1 r))))

(deftest grains-test

  (testing "grains per square"
    (is (= 1 (square->grains 1)))
    (is (= 2 (square->grains 2)))
    (is (= 4 (square->grains 3)))
    (is (= 2 (/ (square->grains 64) (square->grains 63)))))

  (testing "chessboard grains"
    (is (= (geometric-progression->sum 1 2 64) (chessboard->grains)))))
