(ns perun-rum.core
  (:require [rum.core :as rum]))

(defn page [data]
  (rum/render-static-markup
   [:div
    {:dangerouslySetInnerHTML {:__html (-> data :entry :content)}}]))

