package com.example.todoapp.data.repository

import androidx.lifecycle.LiveData
import androidx.room.Query
import com.example.todoapp.data.model.ToDoData
import com.example.todoapp.data.ToDoDao

class ToDoRepository(private val toDoDao: ToDoDao) {

    val getAllData: LiveData<List<ToDoData>> = toDoDao.getAllData()

    val sortByHighPriority: LiveData<List<ToDoData>> = toDoDao.sortByHighPriority()
    val sortByLowPriority: LiveData<List<ToDoData>> = toDoDao.sortByLowPriority()

    suspend fun insertData(toDoData: ToDoData){
        toDoDao.insertData(toDoData)
    }

    suspend fun updateData(toDoData: ToDoData){
        toDoDao.updateData(toDoData)
    }

    suspend fun deleteItem(toDoData: ToDoData){
        toDoDao.deleteItem(toDoData)
    }

    suspend fun deleteAllData(){
        toDoDao.deleteAllData()
    }

    suspend fun searchDatabase(searchQuery: String): List<ToDoData>{
        return toDoDao.searchDatabase(searchQuery)
    }

}