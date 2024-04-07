import List from './list';
import './style.css';
function Fruit(){
    const fruit=[{id:1,name:"orange",calories:23},{id:2,name:"apple",calories:13},{id:3,name:"watermelon",calories:223}]
    const vegetabls=[{id:4,name:"eggplant",calories:23},{id:5,name:"carrot",calories:13},{id:6,name:"onin",calories:223}];
    return(
        <>
       
        {fruit.length>0 ? <List categories="fruit" Items={fruit}/> : null}
        {vegetabls.length && <List categories="vegetables" Items={vegetabls}/>}
   
        
        </>
     )
}
export default Fruit;