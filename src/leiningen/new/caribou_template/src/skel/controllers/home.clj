(ns {{name}}.controllers.home
  (:require [caribou.model :as model]
            [caribou.app.controller :as controller]))

(defn home
  [request]
  (controller/render 
   (assoc request 
     :verbed "Started")))
