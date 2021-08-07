(ns guessing-game.engine
  (:gen-class))

(defn new-game
  [secret score]
  {:secret secret :score score :hit false})

(defn eval-guess
  [game guess]
  (cond
    (= 0 (:score game)) game
    (= guess (:secret game)) (assoc game :hit true)
    :else (assoc game :score (- (:score game) 1))))
