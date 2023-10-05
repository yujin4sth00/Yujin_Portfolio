import { useState } from 'react';
import './App.css';
import SearchIcon from './imgs/search.svg';
import { useEffect } from 'react';
import MovieCard from './components/MovieCard';
import MovieRank from './components/MovieRank';

const API_URL='http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888';


function App() {
  const [movies, setMovies] = useState([]);
  const [searchTerm, setSearchTerm] = useState('');

  const searchMovies=async(date)=>{
    console.log(' 날짜: ' +date);
    const response=await fetch(`${API_URL}&targetDt=${date}`);
    const data=await response.json();

    console.log(data);
    //movies 변수에 저장
    setMovies(data);
  }
  
  // useEffect(()=>{
  //   searchMovies('spiderman');
  // },[])

  return (
    <div className="App">
      <h1>영화진흥위원회 영화 순위(API)</h1>
      <div className='search'>
        <input placeholder='YYYYMMDD' value={searchTerm} onChange={(e)=>{
          setSearchTerm(e.target.value);
        }}></input>
        <img src={SearchIcon} alt='search' onClick={()=>searchMovies(searchTerm)} ></img>
      </div>
      {
        movies.length != 0 ?(
          <div className='container'>
            {
              movies.boxOfficeResult.dailyBoxOfficeList.map((movie)=>{
                console.log(movie);
                return(
                  <MovieRank movie={movie} key={movie.rank}></MovieRank>
                )
              })
            }
            </div>
        ):(
          <div>
            <h2>검색 날짜 기준 영화 순위</h2>
          </div>
        )
      }
    </div>
  );
}


function App_movie() {
  const [movies, setMovies] = useState([]);
  const [searchTerm, setSearchTerm] = useState('');

  //movie title을 이용하여, movies를 검색하는 함수
  //서버에 가서 검색결과를 가져오는 처리를 비동기로 수행
  //fetch() -> then --> then
  //async() 함수에 키워드가 붙는 방식->await()->await()
  const searchMovies=async(title)=>{
    console.log('title: ' +title);
    const response=await fetch(`${API_URL}&s=${title}`);
    const data=await response.json();

    console.log(data);
    //movies 변수에 저장
    setMovies(data);
  }
  //함수 기능 테스트
  //useEffect() 이용하여 처음 렌더링될 때 한번만 호출
  useEffect(()=>{
    searchMovies('spiderman');
  },[])

  return (
    <div className="App">
      <h1>영화정보(IMDB API)</h1>
      <div className='search'>
        <input placeholder='Search for movies' value={searchTerm} onChange={(e)=>{
          setSearchTerm(e.target.value);
        }}></input>
        <img src={SearchIcon} alt='search' onClick={()=>searchMovies(searchTerm)} ></img>
      </div>
      {
        movies.length != 0 ?(
          <div className='container'>
            {
              movies.Search.map((movie)=>{
                console.log(movie);
                return(
                  <MovieCard movie={movie} key={movie.imdbID}></MovieCard>
                )
              })
            }
            </div>
        ):(
          <div>
            <h2>No Movies Found</h2>
          </div>
        )
      }
    </div>
  );
}

export default App;
