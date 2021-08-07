(ns guessing-game.engine-test
  (:require [clojure.test :refer :all]
            [guessing-game.engine :refer :all]))

(deftest new-game-test
  (testing "Get new engine data"
    (is (= 
         {:secret 7 :score 3 :hit false} 
         (new-game 7 3)))))

(deftest eval-guess-test
  (testing "Evaluate a wrong guess"
    (is (= 
         {:secret 7 :score 2 :hit false} 
         (eval-guess (new-game 7 3) 3))))

  (testing "Evaluate a correct guess"
    (is (=
         {:secret 7 :score 3 :hit true}
         (eval-guess (new-game 7 3) 7))))

  (testing "Evaluate a wrong guess with zeroed score"
    (is (=
         {:secret 7 :score 0 :hit false}
         (eval-guess {:secret 7 :score 0 :hit false} 1)))))
