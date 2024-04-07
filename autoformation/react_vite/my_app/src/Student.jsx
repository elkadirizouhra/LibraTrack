import proptypes from 'prop-types'
function student(props){
      return(
        <h1>this is Mr.{props.name} , she has {props.age} , Student: {props.isStudent ? "yes" :"No" }</h1>
      )
}
student.proptypes={
    name:proptypes.string,
    age:proptypes.number,
    isStudent:proptypes.bool
}
student.defaultProps={
    name:"gest",
    age:0,
    isStudent:false
}
export default student