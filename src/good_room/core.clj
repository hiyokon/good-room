(ns good-room.core
  (:require [serial-port :refer :all])
  (:gen-class))

(defn -main
  [& args]
  (System/setProperty "gnu.io.rxtx.SerialPorts" "/dev/ttyACM0")
  (println (list-ports))
  (println "Hello, World!"))
