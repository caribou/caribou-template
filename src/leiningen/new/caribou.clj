(ns leiningen.new.caribou
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "caribou-template"))

(defn caribou
  "Generates a new Caribou project"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info (str "Generating new Caribou project called " name))
    (->files data
             ["project.clj" (render "project.clj" data)]
             ["src/immutant/init.clj" (render "src/immutant/init.clj" data)]
             ["src/{{sanitized}}/boot.clj" (render "src/skel/boot.clj" data)]
             ["src/{{sanitized}}/routes.clj" (render "src/skel/routes.clj" data)]
             ["src/{{sanitized}}/core.clj" (render "src/skel/core.clj" data)]
             ["src/{{sanitized}}/controllers/home.clj" (render "src/skel/controllers/home.clj" data)]
             ["src/{{sanitized}}/hooks/model.clj" (render "src/skel/hooks/model.clj" data)]
             ["src/{{sanitized}}/migrations/admin.clj" (render "src/skel/migrations/admin.clj" data)]
             ["src/{{sanitized}}/migrations/default.clj" (render "src/skel/migrations/default.clj" data)]
             ["src/{{sanitized}}/migrations/order.clj" (render "src/skel/migrations/order.clj" data)]
             ["resources/config/development.clj" (render "resources/config/development.clj" data)]
             ["resources/config/production.clj" (render "resources/config/production.clj" data)]
             ["resources/config/staging.clj" (render "resources/config/staging.clj" data)]
             ["resources/config/test.clj" (render "resources/config/test.clj" data)]
             ["resources/templates/home.html" (render "resources/templates/home.html" (assoc data :verbed "{{verbed}}"))]
             ["resources/public/js/{{name}}.js" (render "resources/public/js/skel.js" data)]
             ["resources/public/css/{{name}}.css" (render "resources/public/css/skel.css" data)]
             ["resources/cljs/{{name}}.cljs" (render "resources/cljs/skel.cljs" data)]
             ["app/assets/.gitignore" (render "app/assets/.gitignore")]
             ["resources/public/favicon.ico" (render "resources/public/favicon.ico")]
             ["resources/public/css/fonts/caribou.eot" (render "resources/public/css/fonts/caribou.eot")]
             ["resources/public/css/fonts/caribou.svg" (render "resources/public/css/fonts/caribou.svg")]
             ["resources/public/css/fonts/caribou.ttf" (render "resources/public/css/fonts/caribou.ttf")]
             ["resources/public/css/fonts/caribou.woff" (render "resources/public/css/fonts/caribou.woff")]
             ["resources/templates/errors/404.html" (render "resources/templates/errors/404.html")]
             ["resources/templates/errors/500.html" (render "resources/templates/errors/500.html")])))

