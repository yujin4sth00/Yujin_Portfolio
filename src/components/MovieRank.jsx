
const MovieRank=({movie:{rank, movieNm, openDt}})=>{
    return(
        <div className="movie" key={rank}>
            <div>
                <p>순위 : {rank}</p>
            </div>
            <div>
                <img src='https://via.placeholder.com/400'></img>
            </div>
            <div>
                <span>순위 : {rank} </span><br />
                <span>개봉 일자 : {openDt}</span>
                <h2>{movieNm}</h2>
            </div>
        </div>
    )
}

export default MovieRank;