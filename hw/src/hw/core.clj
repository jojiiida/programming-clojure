(ns hw.core
  (:import (java.util Date))
  (:use hw.exploring clojure.contrib.str-utils)
)
(def hello-greeting (make-greeter "hello"))
(defn -main [& args] 
 (filter indexable-word? (re-split #"\W+" "A fine day it is"))
 (filter #(> (count %) 2) (re-split #"\W+" "This is a hard day"))
 (hello-greeting "iida")
 (greet-author-2 {:last-name "iida" :first-name "joji"})
)
