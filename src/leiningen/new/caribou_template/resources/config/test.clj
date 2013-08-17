{:database {:classname    "org.postgresql.Driver"
            :subprotocol  "postgresql"
            :host         "localhost"
            :database     "{{sanitized}}_test"
            :user         "postgres"
            :password     "postgres"}
 :template-dir   "site/resources/templates" 
 :controller-ns  "{{name}}.controllers"
 :public-dir     "site/resources/public"
 :api-public     "api/public"
 :asset-dir      "assets"
 :halo-key    "replace-with-halo-key"
 :halo-host   "http://localhost:33333"}
