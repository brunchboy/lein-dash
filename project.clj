(defproject lein-dash "0.1.1"

  :description "Generated docsets from Codox"

  :url "http://www.marcoyuen.com"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[lein-codox "0.9.4"]
                 [enlive "1.1.6"]
                 [org.xerial/sqlite-jdbc "3.8.11.2"]
                 [yesql "0.5.2"]]

  :min-lein-version "2.5.0"

  :eval-in-leiningen true)
