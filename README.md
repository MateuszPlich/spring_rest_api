# Zadanie jest podzielone na podpunkty.

## Zadanie to obejmuje dotychczasowe zagadnienia :)


1. Stwórz projekt (To masz gotowe, bo to czytasz. SUPER! Podjąłeś się wyzwania)
2. W projekcie, stwórz kontrolery restowe, tyle ile potrzebujesz, aby mogło to działąc
3. Potrzebujesz 2 klas: User i address.
4. Użytkownik może mieć wiele adresów, a każdy adres może mieć wielu użytkowników.
5. Każdy z tych kontrolerów, powinien mieć możliwość dodania, usunięcia i pobrania informacji na pddstawie ścieżki (@PathVariable)
6. Adres może zniknąć na zawsze, lub tylko z jednego użytkownika.
7. Użytkownik może zniknąć TYLKO na zawsze.
8. Jeżeli usuwamy użytkownika, to nie koniecznie chcemy usuwać adres.
9. Użyj propertiesów (application.properties lub application.yaml), do nadania śćieżek

##Wytyczne dla projektu:
###ścieżka dla usera powinna wyglądać następująco:
localhost:1532/api/users/[id]/user

###dla adresu:
localhost:1532/api/addresses/[id]/address

###przy wyciąganiu adresu użytkownika:
localhost:1532/api/users/[id]/user/[id]/address

###przy wyciąganiu użytkownika z adresu:
localhost:1532/api/addresses/[id]/address/[id]/user

Przy czym "[id]" jest zmienną w ścieżce (@PathVariable)

Wszystko to, zrób w wirtualnych strukturach (listy / mapy etc). 

##Dla naprawdę ambitnych!

1. Stwórz projekt angularowy, który razem z http (lub httpClient, w zależności od wersji angulara) będzie współpracował z aplikacją backendową
    ###To co powinien taki projekt angularowy zawierać:
   - Wyświetlanie listy użytkowników razem z adresami.
   - Pokazanie szczegółów użytkownika
   - dodanie użytkownika
   - usunięcie użytkownika
   
   ###To samo z adresami.


Pamiętaj, że możesz wykorzystać całą wiedzę, którą posiadasz, aby takie coś osiągnąć.
Tutaj nie ma jednego "najlepszego" rozwiązania.

Powodzenia! :)

PS. Pewnym jest to, że nie napisałem wszystkiego, co powinniście wiedzieć :))
