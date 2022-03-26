(ns browser.main
  (:require [rum.core :as rum]))
            ;; [clojure.string :as str]
            ;; [clojure.test :refer [deftest testing is]]
            ;; [debux.cs.core :as d :refer-macros [clog clogn dbg dbgn break clog_ clogn_ dbg_ dbgn_ break_]]))

(defn init-props []
  {})

(rum/defc repeat-label [n text]
  [:div (replicate n [:.label text])])

(rum/defc zoom-in [children]
  [:.dib.a6.animate__zoomin.d-1.ease-in-out-quint.f1.infinite
    children])

(rum/defc root [props]
  [:.pa2.courier
    (repeat-label 1 "Hello")
    (zoom-in [:div "World"])])

(defn mount []
  (rum/mount (root (init-props)) (js/document.getElementById "app")))

(defn ^:dev/before-load stop []
  (js/console.log "stop"))

(defn ^:dev/after-load start []
  (js/console.log "start")
  (mount))

(defn init []
  (start))
