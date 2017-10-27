package com.pengyd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pengyd.bean.Memberinfo;
import com.pengyd.dao.IMemberinfoDao;
import com.pengyd.service.IMemberinfoService;

@Service("memberinfoService")
public class MemberinfoServiceImpl implements IMemberinfoService{
	@Autowired
	private IMemberinfoDao memberinfoDao;	
	
	@Override
	public Memberinfo findMemberinfoByName(String nickname) {
		Memberinfo memberinfo=memberinfoDao.findMemberinfoByName(nickname);
		return memberinfo;
	}
	
	//插入用户
	@Override
	public void insertMemberinfo(Memberinfo memberinfo) {
		memberinfoDao.insertMemberinfo(memberinfo);
	}
	//更新用户信息
	@Override
	public void updateMemberinfo(Memberinfo memberinfo) {
		memberinfoDao.updateMemberinfo(memberinfo);
		
	}
	//查出用户积分前10的用户
	@Override
	public List<Memberinfo> findMemberinfoTen() {
	  List<Memberinfo> list=memberinfoDao.findMemberinfoTen();
		return list;
	}

	@Override
	public void updateOnlyMemberinfo(Memberinfo memberinfo) {
		memberinfoDao.updateOnlyMemberinfo(memberinfo);
	}

	@Override
	public int findMemberIsonline() {
		int num=memberinfoDao.findMemberIsonline();
		return num;
	}
	
	
//	@Override
//	public List<Memberinfo> findAllMemberInfo(String name) throws MemberServiceException {
//		// TODO Auto-generated method stub
//		List<Memberinfo> list=null;
//		Map<String, Memberinfo> map=new HashMap<>();
//		try {
//			list=memberDao.findAllMmeber();
//			if(list.size()>0){
//				for(Memberinfo m:list){
//					if(m.getGender().equals("0")){
//						m.setGender("男");
//					}else{
//						m.setGender("女");
//					}
//					m.setProvinceCity(Util.getProvinceNameById(m.getProvinceCity()));
//					map.put(m.getNickName(), m);
//					if(map.containsKey(name)){
//						map.remove(name);
//					}
//				}
//			}
//			List<Friendrecord> friends=memberDao.listFriend(name);
//			List<Blackrecord> blacks=memberDao.listBlack(name);
//			for(Friendrecord f:friends){
//				if(map.containsKey(f.getFriendname())){
//					map.remove(f.getFriendname());
//				}
//			}
//			for(Blackrecord b:blacks){
//				if(map.containsKey(b.getBlackname())){
//					map.remove(b.getBlackname());
//				}
//			}
//			list.clear();
//			for(Memberinfo n:map.values()){
//				list.add(n);
//			}
//		} catch (DataAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return list;
//	}
//
//	@Override
//	public List<Memberinfo> findSelectMemberInfo(String name, String age, String gender, String provinceCity)
//			throws MemberServiceException {
//		// TODO Auto-generated method stub
//		long minAge=0L;
//		long maxAge=0L;
//		if(!age.equals("unlimited")){
//			String[] ages=age.split("[-]");
//			minAge=Long.parseLong(ages[0]);
//			maxAge=Long.parseLong(ages[1]);
//		}
//		if(gender.equals("unlimited")){
//			gender=null;
//		}
//		if(provinceCity.equals("unlimited")){
//			provinceCity=null;
//		}
//		List<Memberinfo> list=null;
//		try {
//			list=memberDao.findAllselectMmeber(minAge, maxAge, gender, provinceCity);
//			Map<String,Memberinfo> map=new HashMap<>();
//			if(list.size()>0){
//				for(int i=0;i<list.size();i++){
//					Memberinfo m=list.get(i);
//					map.put(m.getNickName(), m);
//				}
//			}
//			List<Blackrecord> blacks=memberDao.listBlack(name);
//			List<Friendrecord> friends=memberDao.listFriend(name);
//			if(map.containsKey(name)){
//				map.remove(name);
//			}
//			for(Blackrecord b:blacks){
//				if(map.containsKey(b.getBlackname())){
//					map.remove(b.getBlackname());
//				}
//			}
//			for(Friendrecord f:friends){
//				if(map.containsKey(f.getFriendname())){
//					map.remove(f.getFriendname());
//				}
//			}
//			list.clear();
//			for(Memberinfo n:map.values()){
//				n.setProvinceCity(Util.getProvinceNameById(n.getProvinceCity()));
//				if(n.getGender().equals("0")){
//					n.setGender("男");
//				}else{
//					n.setGender("女");
//				}
//				list.add(n);
//			}
//		} catch (DataAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return list;
//	}
//
//	@Override
//	public void delete(String selfname, Map<String, String> map) throws MemberServiceException {
//		// TODO Auto-generated method stub
//		for(String b:map.values()){
//			try {
//				memberDao.deleleBlack(selfname,b);
//			} catch (DataAccessException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}

	
}
