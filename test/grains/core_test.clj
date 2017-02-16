(ns grains.core-test
  (:require [clojure.test :refer :all]
            [grains.core :refer :all]))

(deftest grains-test
  (testing "grains per square"
    (is (= 1 (square->grains 1)))))
