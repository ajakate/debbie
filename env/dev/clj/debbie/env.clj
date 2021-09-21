(ns debbie.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [debbie.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[debbie started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[debbie has shut down successfully]=-"))
   :middleware wrap-dev})
