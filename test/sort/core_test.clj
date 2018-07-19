(ns sort.core-test
  (:require [clojure.test :refer :all]
            [sort.core :refer :all]))

(deftest bubble-test
  (testing "bubble sort "
    (is (= (bubble-sort '(4 2 8)) [2 4 8]))))
