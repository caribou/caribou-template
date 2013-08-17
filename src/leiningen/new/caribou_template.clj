(ns leiningen.new.caribou-template
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "caribou-template"))

(defn caribou-template
  "Generates a new Caribou project"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info (str "Generating new Caribou project called " name))
    (->files data
             ["src/{{sanitized}}/foo.clj" (render "foo.clj" data)])))
