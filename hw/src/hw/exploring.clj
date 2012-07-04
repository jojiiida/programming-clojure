(ns hw.exploring)
(defn indexable-word? [word] 
  (> (count word) 2))
(defn make-greeter [greeting-prefix] 
  (fn [username] (str greeting-prefix ", " username)))
(defn greet-author-1 [author] 
  (println "Hello, " (:first-name author)))
(defn greet-author-2 [{fname :first-name}] 
  (println "Hello, " fname))
