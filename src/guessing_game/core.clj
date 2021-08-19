(ns guessing-game.core
  (:require [guessing-game.engine :refer])
  (:gen-class))

(defn- game-loop
  [game-data]
  (let [{score :score hit :hit secret :secret} game-data]
    (cond 
     (= score 0) 
      (println (str "Game over. score: " score ". The secret was: " secret))
     hit (println (str "Congratulations! You win! score: " score))
     :else (do
              (println (str "score: " score))
              (println "Guess the number:")
              (game-loop (eval-guess game-data (Integer/parseInt (read-line))))))))

(defn- et-until [n] (+ 1 (rand-int n)))

(defn -main
  [& args]
  (do
    (println "Welcome to the Guessing the number game! (Clojure version)")
    (game-loop (new-game (secret-until 10) 3))))

    
