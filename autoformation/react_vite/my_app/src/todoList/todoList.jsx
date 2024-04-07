import './todo.css'
import { useState } from "react";
function todoList(){
const [tasks,settask]=useState([]);
const [taskInput, setTaskInput] = useState("");

function add(event){
    const newTask = taskInput;
    event.preventDefault(); // Empêche la soumission par défaut du formulaire
    if (taskInput.trim() !== "") { // Vérifie si le champ de saisie n'est pas vide
        settask([...tasks, newTask]);
        setTaskInput("");
    }
    else{
            window.alert("Veuillez saisir une tâche avant de l'ajouter."); // Afficher un message d'erreur
        
    }
   
     
}
function handleButtonClick(index){
    settask(tasks.filter((_,i)=>i!==index));
}
function Moveontop(index){
    if(index>0){
        const updateTask=[...tasks];
        
            [updateTask[index],updateTask[index-1]]=[updateTask[index-1],updateTask[index]];
            settask(updateTask)
        }
        }
function movedown(index){
    if(index<tasks.length -1){
        const updateTask=[...tasks];
        
            [updateTask[index],updateTask[index+1]]=[updateTask[index+1],updateTask[index]];
            settask(updateTask)
        }

}
return(
    <div class="container">
        <h1>To-DO-LIST</h1>
        <div class="input1">
                <input id="task" type="text" placeholder="enter a task" value={taskInput} onChange={(e) => setTaskInput(e.target.value)} className="input2" required></input>
                <button onClick={add} className="add">Add</button>
            </div>
      
        <ul>
        
            {tasks.map((task,index)=><ul key={index} class="liste"> <input type="checkbox"  /> <span class="text">{task}</span>   <button onClick={() => handleButtonClick(index)} class="delete">Delete</button> <button onClick={()=>Moveontop(index)} class="move" >👆</button> <button onClick={()=>movedown(index)} class="move" >👇</button></ul>)}
        </ul>
      
       
    </div>
)
}
export default todoList