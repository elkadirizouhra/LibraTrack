import proptypes  from 'prop-types';
function List(props){
    const categorie=props.categories;
    const Item=props.Items;
    const listeFinale=Item.map((element)=><li key={element.id}>{element.name} : {element.calories}</li>)
    return(
        <>
        <h1 class="fv">{categorie}</h1>
        <ol>{listeFinale}</ol>
        </>
    )
}
List.propTypes={
    categorie:proptypes.string,
    Items:proptypes.arrayOf(proptypes.shape({
        id:proptypes.number,
        name:proptypes.string,
        calories:proptypes.number

    }))
}
List.defaultProps={
    categories:"Ctegory",
    Items:[]
}
export default List