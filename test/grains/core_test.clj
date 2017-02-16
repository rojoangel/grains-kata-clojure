(ns grains.core-test
  (:require [clojure.test :refer :all]
            [grains.core :refer :all]))

(deftest grains-test
  (testing "grains per square"
    (is (= 1 (square->grains 1)))
    (is (= 2 (square->grains 2)))
    (is (= 4 (square->grains 3)))))
