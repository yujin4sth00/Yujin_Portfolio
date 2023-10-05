import { useRef, useState } from "react";
import { post } from "axios";
import Button from "react-bootstrap/Button";
import Modal from "react-bootstrap/Modal";
import Form from "react-bootstrap/Form";

const CompanyAdd = () => {
  const fileRef = useRef(null);
  const companynameRef = useRef(null);
  const dateRef = useRef(null);
  const numberRef = useRef(null);
  const [file, setFile] = useState(null);

  const addCompany = () => {
    console.log("addCompany()-> ");
    const url = "http://localhost:3000/api/companyUpload";
    const formData = new FormData();

    formData.append("filename", file.name);
    formData.append("file", file);
    formData.append("companyname", companynameRef.current.value);
    formData.append("date", dateRef.current.value);
    formData.append("number", numberRef.current.value);

    const config = {
      Headers: {
        "content-type": "multipart/form-data",
      },
    };
    //url로 formdata를 전송
    return post(url, formData, config);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    addCompany();
    window.location.reload();
  };

  const [show, setShow] = useState(false);

  const handleClose = () => setShow(false);
  const handleShow = () => setShow(true);

  return (
    <>
      <Button variant="primary" onClick={handleShow}>
        회사 추가
      </Button>

      <Modal show={show} onHide={handleClose}>
        <Form onSubmit={handleSubmit}>
          <Modal.Header closeButton>
            <Modal.Title>회사 정보</Modal.Title>
          </Modal.Header>

          <Modal.Body>
            <Form.Group controlId="formFile" className="mb-3">
              <Form.Label>File Upload</Form.Label>
              <Form.Control
                type="file"
                name="file"
                ref={fileRef}
                onChange={(e) => {
                  setFile(e.target.files[0]);
                }}
              />
            </Form.Group>

            <Form.Group className="mb-3" controlId="formBasicEmail">
              <Form.Label>회사명</Form.Label>
              <Form.Control
                type="text"
                name="companyname"
                ref={companynameRef}
                placeholder="Enter company name"
              />
            </Form.Group>

            <Form.Group className="mb-3" controlId="formBasicEmail">
              <Form.Label>기한</Form.Label>
              <Form.Control
                type="date"
                name="date"
                ref={dateRef}
                placeholder="Enter Date"
              />
            </Form.Group>

            <Form.Group className="mb-3" controlId="formBasicEmail">
              <Form.Label>채용인원</Form.Label>
              <Form.Control
                type="text"
                name="number"
                ref={numberRef}
                placeholder="Enter number"
              />
            </Form.Group>
          </Modal.Body>

          <Modal.Footer>
            <Button type="submit" variant="primary" onClick={handleClose}>
              저장
            </Button>
            <Button variant="secondary" onClick={handleClose}>
              닫기
            </Button>
          </Modal.Footer>
        </Form>
      </Modal>
    </>
  );
};

export default CompanyAdd;
