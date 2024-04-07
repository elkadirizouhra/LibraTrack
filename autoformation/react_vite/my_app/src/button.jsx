import { useState } from "react"
function Button() {
const [res,setRes]=useState();
const handlclick=()=>{
   setRes("zahira stop clikcing on me");
}

return(
    <div>
        <button onClick={handlclick}> click on me 😁</button>
        <p>{res}</p>
       
    </div>
)
    
}
export default Button