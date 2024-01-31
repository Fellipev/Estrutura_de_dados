# Memória
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
________________________________________________________

# Pilha
Último elemento é o primeiro a sair -> LIFO (Last in First Out)

Parecido com a estrutura de nó, porém o primeiro elemento colocado tera sua referencia apontada para null<br>
e os elementos a cima apontaram para o de baixo, exemplo...
elemento 1 ref -> null, elemento 2 ref -> elemento 1, elemento 3 ref -> elemento 2...<br>
No topo da lista tem uma referencia que aponta para ele também.
_________________________________________________________

# Fila
FIFO (First in First Out)
Nessa estrutura, o primeiro da fila vai apontar pra null.
tem uma referencia de nó por onde se entra na fila.

- enqueue() -> enfileirar (colocar na fila)
- dequeue() -> desenfileirar (tirar da fila)
- isEmpty
_____________________________________________________

# Lista encadeada
Se parece com a fila, porem podemos adicionar elementos em diversos lugares<br>
ou seja ele não é nem FIFO nem LIFO necessáriamente.

