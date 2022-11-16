package com.ezenfit.gm.member.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ezenfit.gm.vo.PtVO;
import com.ezenfit.gm.vo.PtreVO;
import com.ezenfit.gm.vo.ReservationVO;
import com.ezenfit.gm.vo.MemregiVO;

//-----------------------------------------------------------------------------------------------------------
// public interface TrainerDAO
//-----------------------------------------------------------------------------------------------------------
public interface MemberDAO {
	
	//-----------------------------------------------------------------------------------------------------------
	// pt정보 달력에 가져오기 회원의 강의종류(ef_p_type)
	//-----------------------------------------------------------------------------------------------------------		
	public MemregiVO memberRegi(String ef_id) throws DataAccessException;

	//-----------------------------------------------------------------------------------------------------------
	// 예약한 pt리스트, 나의 예약 현황에 가져오기
	//-----------------------------------------------------------------------------------------------------------		
	public List<PtVO> reservationPtlist(ReservationVO reservationVO) throws DataAccessException;
	
	//-----------------------------------------------------------------------------------------------------------
	// pt정보 달력에 가져오기(회원)
	//-----------------------------------------------------------------------------------------------------------		
	public List<PtVO> findMyTypePtList(PtVO ptVO) throws DataAccessException;

	//-----------------------------------------------------------------------------------------------------------
	// 중복 예약 방지
	//-----------------------------------------------------------------------------------------------------------		
	public int countReservation(ReservationVO reservationVO) throws DataAccessException;
	
	//-----------------------------------------------------------------------------------------------------------
	// 예약 카운트 (같은 날 같은 타임에 여러개 강의 예약 방지)
	//-----------------------------------------------------------------------------------------------------------
	public int reservationCount(PtreVO ptreVO) throws DataAccessException;
	
	//-----------------------------------------------------------------------------------------------------------
	// 예약하기
	//-----------------------------------------------------------------------------------------------------------		
	public int insertReservation(ReservationVO reservationVO) throws DataAccessException;
	
	//-----------------------------------------------------------------------------------------------------------
	// 예약인원 1증가
	//-----------------------------------------------------------------------------------------------------------		
	public int r_personalOnePlus(ReservationVO reservationVO) throws DataAccessException;
	
	//-----------------------------------------------------------------------------------------------------------
	// 참여가능횟수 1감소
	//-----------------------------------------------------------------------------------------------------------		
	public int countOneMiuns(ReservationVO reservationVO) throws DataAccessException;
	
	//-----------------------------------------------------------------------------------------------------------
	// 예약 취소하기
	//-----------------------------------------------------------------------------------------------------------		
	public int deleteReservation(ReservationVO reservationVO) throws DataAccessException;
	
	//-----------------------------------------------------------------------------------------------------------
	// 예약인원 1감소
	//-----------------------------------------------------------------------------------------------------------		
	public int r_personalOneMinus(ReservationVO reservationVO) throws DataAccessException;
	
	//-----------------------------------------------------------------------------------------------------------
	// 참여가능횟수 1증가
	//-----------------------------------------------------------------------------------------------------------		
	public int countOnePlus(ReservationVO reservationVO) throws DataAccessException;
	
	
} // End - public interface TrainerDAO
