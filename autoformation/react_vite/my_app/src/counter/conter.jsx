import { useState } from "react"
import './style.css'
function conter(){
const [increase,setIncrease]=useState(0);
const Increase=()=>{
    setIncrease(prevIncreas => prevIncreas + 1);
    setIncrease(prevIncreas => prevIncreas + 1);
    setIncrease(prevIncreas => prevIncreas + 1);

    z
}
const decrease=()=>{
    setIncrease(c=>c-1);
    setIncrease(c=>c-1);
}
const reset=()=>{
    setIncrease(0);
}
return(
    <div class="container">
        <h1>{increase}</h1>
        <div class="buttons">
        <button class="button" onClick={Increase}>Increase</button>
        <button class="button" onClick={reset}>reset</button>
        <button class="button" onClick={decrease}>decrease</button>
        </div>
       
    </div>
)
}
export default conter