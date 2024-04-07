import { useState } from "react"
function Mycomponent(){
 const [res,setRes]= useState();
 const [age,setAge]= useState(18);
 const [isEmployed,setisEmployed]=useState(false);
 const update=()=>{
    setRes("zahira");
    
 }
 const updateAge=()=>{
 setAge(age+1);
 }
 const updateEmployed=()=>{
    setisEmployed(!isEmployed);
    }
 return(
    <div>
        <h1>Name:{res}</h1>
        <button onClick={update}>set Name </button>
        <h1>Age:{age}</h1>
        <button onClick={updateAge}>increment Age</button>
        <h1>Employed:{isEmployed ? "yes":"No"}</h1>
        <button onClick={updateEmployed}>setEmployed</button>
    </div>
 )
             

}
export default Mycomponent