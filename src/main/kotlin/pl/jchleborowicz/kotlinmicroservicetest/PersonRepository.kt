package pl.jchleborowicz.kotlinmicroservicetest

import org.springframework.stereotype.Repository

@Repository
class PersonRepository {
    val persons: MutableList<Person> = ArrayList()

    fun findById(id: Int): Person? = persons.singleOrNull {it.id == id }

    fun findAll(): List<Person> = persons

    fun save(person: Person): Person = person.apply {
        id = persons.size + 1
        persons.add(this)
    }

    fun update(person: Person): Person = person.apply {
        val index = persons.indexOf(person)
        if (index < 0) throw IllegalArgumentException("Person with id ${this.id} does not exist")
        persons[index] = person
    }

    fun removeById(id: Int): Boolean = persons.removeIf { it.id == id }
}
