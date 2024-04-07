import { useState } from "react"
import './style.css'
function colorPicker(){
    const [color,setColor]=useState("#FFFFFF");
    const handleColor=(event)=>{
        setColor(event.target.value);
    }
    return(
        <div class="color">
            <h1>Color Picker</h1>
            <div class="selectColor" style={{backgroundColor:color}}>
            <p >Selected Color : {color} </p>
            </div>
            <label>Select a color :</label>
            <input type="color" value={color} onChange={handleColor}/>
           
           
        </div>
         
    )
}
export default colorPicker