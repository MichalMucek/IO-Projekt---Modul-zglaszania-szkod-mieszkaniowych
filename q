[33mcommit 2638e68adbe8d3e84109a29d22da3b198c13440c[m[33m ([m[1;36mHEAD -> [m[1;32mmaster[m[33m, [m[1;31morigin/team-1[m[33m, [m[1;31morigin/master[m[33m, [m[1;31morigin/HEAD[m[33m, [m[1;32mteam-1[m[33m)[m
Author: Michał Mucek <michal.mucek@gmail.com>
Date:   Mon Dec 10 19:00:58 2018 +0100

      Zaczęcie endpointu do przesyłania decyzji przez ubezpieczyciela

[1mdiff --git a/modul_zglaszania_szkod_mieszkaniowych/src/main/java/edu/agh/io_projekt/gr2/modul_zglaszania_szkod_mieszkaniowych/web/ModuleController.java b/modul_zglaszania_szkod_mieszkaniowych/src/main/java/edu/agh/io_projekt/gr2/modul_zglaszania_szkod_mieszkaniowych/web/ModuleController.java[m
[1mindex 38c6aed..fd21b49 100644[m
[1m--- a/modul_zglaszania_szkod_mieszkaniowych/src/main/java/edu/agh/io_projekt/gr2/modul_zglaszania_szkod_mieszkaniowych/web/ModuleController.java[m
[1m+++ b/modul_zglaszania_szkod_mieszkaniowych/src/main/java/edu/agh/io_projekt/gr2/modul_zglaszania_szkod_mieszkaniowych/web/ModuleController.java[m
[36m@@ -34,4 +34,11 @@[m [mpublic class ModuleController {[m
 [m
         return "";[m
     }[m
[32m+[m
[32m+[m[32m    @RequestMapping(value = "/api/decision", method = RequestMethod.POST)[m
[32m+[m[32m    public String postDecision() // TODO: Dodać parametry[m
[32m+[m[32m        {[m
[32m+[m
[32m+[m[32m        return "";[m
[32m+[m[32m    }[m
 }[m
\ No newline at end of file[m
