import { useRef } from "react";
import UseFetch from "./UseFetch";
import { useHistory } from "react-router-dom";

const CreateCompany=()=>{
    const words = UseFetch('http://localhost:3001/words');
    const history = useHistory();

    const nameRef = useRef(null);
    const numberRef = useRef(null);
    const jobRef = useRef(null);
    const dateRef = useRef(null);

    const onSubmit=(e)=>{
        e.preventDefault();
        fetch('http://localhost:3001/words/',{
            method:"POST",
            headers:{
                "Content-type":"application/json",
            },
            body: JSON.stringify({
                name:nameRef.current.value,
                number:numberRef.current.value,
                job:jobRef.current.value,
                date:dateRef.current.value,
                isDone:false,
            }),
        }).then(res=>{
            if(res.ok){
                alert("추가가 완료되었습니다.");
                history.push(`/`);
            }
        });
    }
    return(
        <form onSubmit={onSubmit}>
            <div className="input_area">
                <label>회사명</label>
                <input type="text" placeholder="회사명" ref={nameRef} />
            </div>
            <div className="input_area">
                <label>채용 인원 명수</label>
                <input type="text" placeholder="채용 인원" ref={numberRef} />
            </div>
            <div className="input_area">
                <label>직무</label>
                <input type="text" placeholder="채용 직무" ref={jobRef} />
            </div>
            <div className="input_area">
                <label>채용 마감 기한</label>
                <input type="text" placeholder="xxxx-xx-xx" ref={dateRef} />
            </div>
            <button>저장</button>
        </form>
    )
}

export default CreateCompany;