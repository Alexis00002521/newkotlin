package com.auroagroup.myapppractice

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.auroagroup.myapppractice.ui.theme.MyAppPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyAppPracticeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TaskListApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TaskListApp(modifier: Modifier) {
    val tasks = remember { mutableStateListOf(Task("", "")) }
    var editingTask by remember { mutableStateOf<Task?>(null) }

    Scaffold(
        topBar = {
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { tasks.add(Task("", "")) },

                ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add Task"
                )
            }
        },
        content = {
            TaskList(
                tasks = tasks,
                onTaskClick = { task -> editingTask = task }
            )
            editingTask?.let {
                TaskEditor(
                    task = it,//OPTINE TAREA
                    onTaskEdited = { editedTask ->
                        tasks[tasks.indexOf(it)] = editedTask
                        editingTask = null

                    },
                    //En caso que cancele
                    onTaskDismissed = { editingTask = null }
                )
            }
        }
    )
}

@Composable
fun TaskList(tasks: List<Task>, onTaskClick: (Task) -> Unit) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        items(tasks) { task ->
            TaskItem(
                task = task,
                onTaskClick = { onTaskClick(task) }
            )
        }
    }
}

@Composable
fun TaskItem(task: Task, onTaskClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clickable(onClick = onTaskClick),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = task.title,

                )
            Text(
                text = task.description,
            )
        }
    }
}

@Composable
fun TaskEditor(
    task: Task,
    onTaskEdited: (Task) -> Unit,
    onTaskDismissed: () -> Unit
) {
    var title by remember { mutableStateOf(TextFieldValue(task.title)) }
    var description by remember { mutableStateOf(TextFieldValue(task.description)) }

    Dialog(onDismissRequest = onTaskDismissed) {
        Surface(
            modifier = Modifier.width(300.dp),
            shape = MaterialTheme.shapes.medium,
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                TextField(
                    value = title,
                    onValueChange = { title = it },
                    label = { Text("Title") }
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextField(
                    value = description,
                    onValueChange = { description = it },
                    label = { Text("Description") }
                )
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    TextButton(onClick = onTaskDismissed) {
                        Text("Cancel")
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    TextButton(onClick = {
                        onTaskEdited(Task(title.text, description.text))
                    }) {
                        Text("Save")
                    }
                }
            }
        }
    }
}

data class Task(val title: String, val description: String)

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TaskListApp(modifier = Modifier.padding(15.dp))
}



