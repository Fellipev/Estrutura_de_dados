# Memória
__________________________________________________
## Memória Primária
- Não mantem os dados na ausencia de energia.

## Memória Secundária
- Mantém os dados mesmo na ausencia de energia.

# Memória RAM
- Composta de vários chips que possuem endereços de memória.
- Cada chip armazena milhoes de bits temporariamente.
__________________________________________________

# Atribuição e Referência

quando se atribui um objeto para outro, exemplo...<br>
```
        Obj A = new Obj();
        Obj B = A;
```
O que esta acontecendo no código acima não é uma atribuição de objeto e sim<br>
endereço de memória, ou seja se eu alterar algo no obj B, o objeto A tb sofrerá alteração<br>
pois partilham o mesmo endereço de memória.
_________________________________________________________________
# Nó
- Espaço em memória que armazena o dado na memória e uma referência para um próximo nó.<br>
Seria semelhante aos ponteiros do C.
- O útilmo nó é apontado para null.
_______________________________________________________________
# Generics 
````
Lista<String> minhaLista = new Lista<>();

public class Lista<T> {
    private T t;
    .
    .
    .
}
````
## Contexto
- Evitar casting excessivo.
- Evitar códigos redundantes.
- Econtrar erros em tempo de compilação.
- Introduzido desde o Java SE 5.0.

## Unkown Wildcard
````
public void imprimeLista(List<?> lista) {
    for(Object obj : lista){
        System.out.println(obj);
    }
}

List<Aluno> minhaLista = new List<Aluno>();
imprimeLista(minhaLista);
````

## UpperBounded Wildcard

````
public void imprimeLista(List<? extends Pessoa> listaPessoas) {
    for(Pessoa p : listaPessoas){
        System.out.println(p);
    }
}
List<Aluno> minhaLista = new List<Aluno>();
imprimeLista(minhaLista);
````

## Convenção
- K -> "Key", exemplo: Map<K,V>
- V -> "Value", exemplo: Map<K,V>
- E -> "Element", exemplo: List<E>
- T -> "Type", exemplo: Collections#addAll
- ? quando genérico

