package hello.core.member;

public class MemberSerivceImpl implements MemberService{

    // Member   ServiceImpl은 MemberRepository , MemoryMember Repository 모두 의존
    private final MemberRepository memberRepository;

    public MemberSerivceImpl( MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }


    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}