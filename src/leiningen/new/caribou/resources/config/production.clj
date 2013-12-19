{:logging {:loggers [{:type :stdout :level :warn}
                     ;; {:type :remote :host "beast.local" :level :debug}
                     ;; {:type :file :file "caribou-logging.out" :level :warn}
                     ]}
 :database {:classname    "org.postgresql.Driver"
            :subprotocol  "postgresql"
            :host         "localhost"
            :database     "{{sanitized}}_production"
            :user         "postgres"
            :password     "postgres"}
 :controller {:namespace "{{name}}.controllers" :reload :never}
 :cache-templates :always}
