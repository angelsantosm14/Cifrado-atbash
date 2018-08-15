(ns clj12161406.atbash
  (:require [clj12161406.fos :as fos] :reload)
  )
;Nombre: Santos Martinez Angel
;grupo: ISA
;Numero de control: 12161406 

;latbash
(defn latbash [ys]
  (fos/lmap ys (fn [a] (fos/cifrar-caracter a )))
  )

;vatbash
(defn vatbash [ys]
  (fos/vmap ys (fn [a] (fos/cifrar-caracter a)))
  )
;satbash
(defn satbash [xs]
  (fos/smap xs (fn [a] (fos/cifrar-caracter a)))
  )

