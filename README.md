## Memento
Es un patron de comportamiento (behavioral). [Link descripcion](https://sourcemaking.com/design_patterns/memento)

Memento se apoya en una construcción de objetos caretaker originator y memento, donde el originator genera mementos(con la información necesaria para restaurarse en el futuro) y luego 
en algún momento de la ejecución el caretaker puede volver a pasarle el memento al originator
que usara la información del mento para reestablecerse a un estado anterior.

