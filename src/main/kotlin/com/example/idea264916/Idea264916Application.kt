package com.example.idea264916

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import javax.sql.DataSource

@SpringBootApplication
class Idea264916Application(dataSource: DataSource)

fun main(args: Array<String>) {
    runApplication<Idea264916Application>(*args)
}
