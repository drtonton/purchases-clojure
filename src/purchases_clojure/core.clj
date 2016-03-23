(ns purchases-clojure.core
  (:require [clojure.string :as str]
            [clojure.walk :as walk])
  (:gen-class))

(defn -main []
  (let [purchases (slurp purchases.csv) ; parses purchases.csv
        purchases (str/split-lines purchases) 
        purchases (map (fn [line] 
                         (str/split line #",")) 
                    purchases)
        header (first purchases)
        purchases (rest purchases)
        purchases (map (fn [line]
                         (apply hash-map (interleave header line)))
                       purchases)
        purchases (walk/keywordize-key purchases)
        (println "Choose item category: Alcohol, Shoes, Furniture, Toiletries, Food, Jewelry")
        (def cats'("Alcohol" "Shoes" "Furniture" "Toiletries" "Food" "Jewelry"))
        (let [text (read-line)
              (if (= true [contains? cats text]))])]))
                
             
                      
                        
                        
                   
  
