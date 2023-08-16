import { useEffect, useState } from "react";

//각 컴포넌트 DayList, WordList에서 사용되는 fetch()
//이 부분을 UseFetch() 함수로 선언하고, 각 컴포넌트에서 사용
const UseFetch=(url)=>{
    const [data, setData]=useState([]);
    useEffect(()=>{
        console.log('UseFetch() 이용 json 서버로부터 정보를 가져옴!');
        fetch(url).then((res)=>{
            return res.json();
        }).then((res)=>{
            //console.log(res);
            setData(res);
        })
    },[url]);
    return data;
}

export default UseFetch;