(ns clj12161406.fos)

(defn cifrar-caracter[x]
  (let [a ({\a \z \á \y \b \x \c \w \d \v \e \ü \é \ú \f \u \g \t \h \s 
            \i \r \í \q \j \p \k \ó \l \o \m \ñ \n \n \ñ \m \o \l \ó \k \p \j
            \q \í \r \i \s \h \t \g \u \f \ú \é \ü \e \v \d \w \c \x \b \y \á
            \z \a
            
            \A \Z \Á \Y \B \X \C \W \D \V \E \Ü \É \Ú \F \U \G \T \H \S 
            \I \R \Í \Q \J \P \K \Ó \L \O \M \Ñ \N \N \Ñ \M \O \L \Ó \K \P \J
            \Q \Í \R \I \S \H \T \G \U \F \Ú \É \Ü \E \V \D \W \C \X \B \Y \Á
            \Z \A
            }x)]  (if (nil? a)  x a ) ) )


(defn lmap [lista funcion]
  (letfn [(recursiva [xs ys g]
            (if (empty? xs)
              ys
              (recursiva (butlast xs) (conj ys (g (last xs))) g)
              )
            )] (recursiva lista '() funcion))
  )
(defn vmap [vector funcion]
  (letfn [(recursiva [xs ys g]
            (if (empty? xs)
              ys
              (recursiva (rest xs) (conj ys (g (first xs))) g )
              )
            )] (recursiva vector [] funcion))
  )

(defn smap [ys funcion]
  (letfn [(recursiva [xs ys g]
            (if (empty? xs)
              ys
              (recursiva (rest xs) (str ys (g (first xs))) g)
              )
            )] (recursiva ys "" funcion))
  )